package com.education.media.service;

import com.education.base.model.PageParams;
import com.education.base.model.PageResult;
import com.education.base.model.RestResponse;
import com.education.media.model.dto.QueryMediaParamsDto;
import com.education.media.model.dto.UploadFileParamsDto;
import com.education.media.model.dto.UploadFileResultDto;
import com.education.media.model.po.MediaFiles;

/**
 * @description 媒资文件管理业务类
 * @author Mr.M
 * @date 2022/9/10 8:55
 * @version 1.0
 */
public interface MediaFileService {

 /**
  * @description 媒资文件查询方法
  * @param pageParams 分页参数
  * @param queryMediaParamsDto 查询条件
  * @return com.xuecheng.base.model.PageResult<po.model.com.education.media.MediaFiles>
  * @author Mr.M
  * @date 2022/9/10 8:57
 */
 public PageResult<MediaFiles> queryMediaFiels(Long companyId,PageParams pageParams, QueryMediaParamsDto queryMediaParamsDto);
 public UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, String localFilePath);
 /**
  * @description 检查文件是否存在
  * @param fileMd5 文件的md5
  * @return com.xuecheng.base.model.RestResponse<java.lang.Boolean> false不存在，true存在
  * @author Mr.M
  * @date 2022/9/13 15:38
  */
 public RestResponse<Boolean> checkFile(String fileMd5);

 /**
  * @description 检查分块是否存在
  * @param fileMd5  文件的md5
  * @param chunkIndex  分块序号
  * @return com.xuecheng.base.model.RestResponse<java.lang.Boolean> false不存在，true存在
  * @author Mr.M
  * @date 2022/9/13 15:39
  */
 public RestResponse<Boolean> checkChunk(String fileMd5, int chunkIndex);
 public RestResponse uploadChunk(String fileMd5,int chunk,String absolutePath);
 public RestResponse mergechunks(Long companyId,String fileMd5,int chunkTotal,UploadFileParamsDto uploadFileParamsDto);
}
