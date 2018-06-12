//package cn.e3mall.manager.controller;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//
//import cn.e3mall.manager.utils.FastDFSClient;
//import cn.e3mall.page.helper.JsonUtils;
//import cn.e3mall.page.helper.KindEditorResult;
//
//@Controller
//public class UploadController {
//
//	//注入图片服务器地址
//	@Value("${IMAGE_SERVER_URL}")
//	private String IMAGE_SERVER_URL;
//
//	/**
//	 * 需求：使用fastDFS分布式文件系统上传图片
//	 * 请求：/pic/upload
//	 * 参数：uploadFile
//	 * 返回值：
//	 * 	//成功时
//			{
//        	"error" : 0,
//        	"url" : "http://www.example.com/path/to/file.ext"
//			}
//		//失败时
//			{
//        	"error" : 1,
//        	"message" : "错误信息"
//			}
//			防止冗余：
//			成功时：
//			{
//				"error":0,
//				"url":"http://ip/M00/00/00/",
//				"message":null,
//			}
//			失败时：
//			{
//				"error":1,
//				"url":null,
//				"message":"上传失败",
//			}
//	 */
//	@RequestMapping("/pic/upload")
//	public @ResponseBody
//		String uploadPic(MultipartFile uploadFile){
//		try {
//			//获取文件扩展名
//			//获取文件名
//			String originalFilename = uploadFile.getOriginalFilename();
//			//获取文件扩展名:jpg
//			String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);
//
//			//创建fastDFS工具类对象，上传图片
//			FastDFSClient fClient = new FastDFSClient("classpath:client.conf");
//			//上传:
//			//返回虚拟磁盘路径：group1/M00/00/00/wKhCQ1i3kk2AeM1bAABdrZgsqUU187_big.jpg
//			String diskUrl = fClient.uploadFile(uploadFile.getBytes(), extName);
//			//组合图片绝对路径，保存数据库，或者图片回显
//			String url = IMAGE_SERVER_URL+diskUrl;
//
//			//创建KindEditorResult对象，包装图片上传信息
//			KindEditorResult result = new KindEditorResult();
//			//成功
//			result.setError(0);
//			result.setUrl(url);
//
//			//把返回值结果对象转换成json字符串
//			String picJson = JsonUtils.objectToJson(result);
//
//			//返回
//			return picJson;
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//
//			//失败
//			//创建KindEditorResult对象，包装图片上传信息
//			KindEditorResult result = new KindEditorResult();
//			//成功
//			result.setError(1);
//			result.setMessage("上传失败");
//			//把返回值结果对象转换成json字符串
//			String picJson = JsonUtils.objectToJson(result);
//
//			//返回
//			return picJson;
//		}
//	}
//
//}
