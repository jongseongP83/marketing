/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.samsung.sds.emarket.marketing.api;

import com.samsung.sds.emarket.marketing.api.model.CampaignDTO;
import com.samsung.sds.emarket.marketing.api.model.NewCampaignDTO;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Validated
@Api(value = "Campaigns", description = "the Campaigns API")
public interface CampaignsApi {

    /**
     * DELETE /api/v1/campaigns/{id}
     * Delete a campaign with the specified id
     *
     * @param id Campaign ID (required)
     * @return Success (status code 204)
     *         or No campaign with the specified id (status code 404)
     */
    @ApiOperation(value = "", nickname = "deleteCampaign", notes = "Delete a campaign with the specified id", tags={ "Campaigns", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Success"),
        @ApiResponse(code = 404, message = "No campaign with the specified id") })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/campaigns/{id}"
    )
    ResponseEntity<Boolean> deleteCampaign(@ApiParam(value = "Campaign ID", required = true) @PathVariable("id") Integer id);


    /**
     * GET /api/v1/campaigns/{id}
     *
     * @param id Campaign ID (required)
     * @return Success (status code 200)
     *         or No campaign with the specified id (status code 404)
     */
    @ApiOperation(value = "", nickname = "getCampaign", notes = "", response = CampaignDTO.class, tags={ "Campaigns", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignDTO.class),
        @ApiResponse(code = 404, message = "No campaign with the specified id") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/campaigns/{id}",
        produces = { "application/json" }
    )
    ResponseEntity<CampaignDTO> getCampaign(@ApiParam(value = "Campaign ID", required = true) @PathVariable("id") Integer id);


    /**
     * GET /api/v1/campaigns
     *
     * @return Success (status code 200)
     */
    @ApiOperation(value = "", nickname = "getCampaignList", notes = "", response = CampaignDTO.class, responseContainer = "List", tags={ "Campaigns", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = CampaignDTO.class, responseContainer = "List") })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/campaigns",
        produces = { "application/json" }
    )
    ResponseEntity<List<CampaignDTO>> getCampaignList();


    /**
     * POST /api/v1/campaigns
     * Create new campaign
     *
     * @param newCampaignDTO  (optional)
     * @return OK (status code 201)
     */
    @ApiOperation(value = "", nickname = "postCampaign", notes = "Create new campaign", response = CampaignDTO.class, tags={ "Campaigns", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "OK", response = CampaignDTO.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/campaigns",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CampaignDTO> postCampaign(@ApiParam(value = "") @Valid @RequestBody(required = false) NewCampaignDTO newCampaignDTO);


    /**
     * PUT /api/v1/campaigns/{id}
     * Update a campaign with the specified id
     *
     * @param id Campaign ID (required)
     * @param newCampaignDTO  (optional)
     * @return OK (status code 200)
     *         or No campaign with the specified id (status code 404)
     */
    @ApiOperation(value = "", nickname = "putCampaign", notes = "Update a campaign with the specified id", response = CampaignDTO.class, tags={ "Campaigns", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = CampaignDTO.class),
        @ApiResponse(code = 404, message = "No campaign with the specified id") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/campaigns/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<CampaignDTO> putCampaign(@ApiParam(value = "Campaign ID", required = true) @PathVariable("id") Integer id,@ApiParam(value = "") @Valid @RequestBody(required = false) NewCampaignDTO newCampaignDTO);

}
