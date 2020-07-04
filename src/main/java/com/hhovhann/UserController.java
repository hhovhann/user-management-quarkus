package com.hhovhann;

import com.hhovhann.service.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class UserController {

    @Inject
    UserService userService;

    @GET
    @Path("/all")
    @Produces(MediaType.TEXT_PLAIN)
    public List<String> allUsers() {
        return userService.allUsers();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser() {
        return "all users will become here ...";
    }

    @POST
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String updateUser(Long id) {
        return "updated user by id ...";
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public String deleteUser(Long id) {
        return "all users will become here ...";
    }
}