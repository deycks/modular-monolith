package com.example.microservice.api;

import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.modules.user.management.interfaces.UserManagement;
import com.example.microservice.modules.user.model.UserResponseDto;
import com.example.microservice.modules.user.util.UserEnum;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Contiene una breve explicacion del microservicio", tags = {"TemplateMicroservice"})
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/v1/user")
public class UserController {
	
	@Autowired
	private UserManagement userManagement;
	
	@ApiOperation(value = "Breve explicacion de lo que reliza el metodo",
			notes = "Explicacion un poco mas detallada de lo que realiza el metodo.")
	@ApiResponses({ @ApiResponse(code = 200, message = "Ok"),  @ApiResponse(code = 401, message = "No Autorizado")})
	@GetMapping("/")
	public UserResponseDto getUser(
			@ApiParam("User ID")
			@NotEmpty (message = UserEnum.PARAM_REQ)
			@RequestParam("id") String id
			) {
		
		return userManagement.getUser(id);
		
	}
	

}
