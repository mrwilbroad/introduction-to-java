package FilesCreater;

import FilesCreater.enums.Role;

public class UserModel {

    private final Role userRole;

    public UserModel(Role userRole){
        this.userRole = userRole;
    }

    public String getUserRole(){

        return switch (this.userRole){
            case Role.ADMIN-> "Admin role is assigned";
            case Role.TEACHER-> "Teacher role is assigned";
            case Role.USER-> "User role is assigned";
            case Role.STUDENT-> "Student role is assigned";
        };
    }



}
