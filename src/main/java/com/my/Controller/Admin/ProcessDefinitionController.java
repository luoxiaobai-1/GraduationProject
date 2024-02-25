package com.my.Controller.Admin;

import com.my.Annotation.Log;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 响应的 MediaType 都是 application/json
@RequestMapping(path = "/process-definition", produces = "application/json")
// Tag 注解, 给整个接口起了个名字 "流程定义", 描述是 "流程定义 API"
@Tag(name = "流程定义", description = "流程定义 API")
// ApiResponses 给每个接口提供一个默认的响应, 状态码是 200, 描述是 "接口请求成功"
@ApiResponses(@ApiResponse(responseCode = "200", description = "接口请求成功"))
public class ProcessDefinitionController {

    // Operation 注解设置了接口名称, 接口描述

@Log(op = "1")
    @Operation(summary = "查询单个 bpmn xml 数据")
    @GetMapping("/bpmn-xml")
    public String findBpmnXml(
            // Parameter 注解设置了请求参数的描述, 是否必填 以及示例
            @Parameter(description = "流程部署ID", required = true, example = "1234") String deployId,
            @Parameter(description = "流程资源名称", required = true, example = "xxx.bpmn") String resourceName) {
        return "24312";
    }
}
