package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javaex.service.SolInfoService;
import com.javaex.util.JsonResult;
import com.javaex.vo.SolCartVo;
import com.javaex.vo.SolProductVo;
import com.javaex.vo.SolReviewVo;

@RestController
@RequestMapping("home/info/")
public class SolInfoController {

	@Autowired
	private SolInfoService infoService;

	/*******************************
	 * ProductInfo Contorller
	 * @param cartList
	 * @return
	 */
	@PostMapping("add")
	public JsonResult addCart(@RequestBody List<SolCartVo> cartList) {
		System.out.println("SolInfoController.addCart");
		System.out.println(cartList.size());
		if (cartList.size() > 0) {
			infoService.exeCartAdd(cartList);
			return JsonResult.success(cartList.size());
		} else {
			return JsonResult.fail("선택한 상품 없음");
		}
	}

	@PostMapping("product/{no}")
	public JsonResult getProduct(@PathVariable(value = "no") int no) {
		System.out.println("SolInfoController.getProduct"+no);
		SolProductVo productVo = infoService.exeGetInfo(no);
		if (productVo != null) {
			return JsonResult.success(productVo);
		} else {
			return JsonResult.fail("상품정보 불러오기 실패");
			
		}
	}
	@PostMapping("review/{no}")
	public JsonResult getReview(@PathVariable(value = "no") int no) {
		System.out.println("SolInfoController.getReview"+no);
		List<SolReviewVo> reviewList = infoService.exeGetReview(no);
		if(reviewList.size() == 0) {
			return JsonResult.fail("리뷰없음");
		} else if (reviewList != null) {
			return JsonResult.success(reviewList);
		} else {
			return JsonResult.fail("불러오기 실패");
		}
	}
	
	@PostMapping("review")
	public JsonResult reviewWrite(@RequestParam(name = "file", required = false) MultipartFile file, 
								  @RequestParam("star") int star, 
								  @RequestParam("userNo") int userNo, 
								  @RequestParam("productNo") int pNo, 
								  @RequestParam("content") String content) {
		System.out.println("SolInfoController.reviewWrite"+userNo);
		System.out.println(file+"/"+star+"/"+content);
		
		infoService.exeSetReview(file, new SolReviewVo(star, content, userNo, pNo));
		return null;
	}
	
	/*******************************
	 * Cart Contorller
	 * @param cartList
	 * @return
	 */
	@PostMapping("usercart")
	public JsonResult cartList(@RequestParam("userNo") int userNo) {
		System.out.println("SolInfoController.cartList: "+userNo);
		List<SolCartVo> cartList = infoService.exeCartList(userNo);
		if(cartList.size() > 0) {
			return JsonResult.success(cartList);
		} else {
			return JsonResult.fail("장바구니비어있음");
		}
	}

}
