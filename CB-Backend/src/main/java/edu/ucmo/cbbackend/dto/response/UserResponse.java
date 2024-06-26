package edu.ucmo.cbbackend.dto.response;

import edu.ucmo.cbbackend.model.ChangeRequest;
import edu.ucmo.cbbackend.model.Roles;
import edu.ucmo.cbbackend.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
        private Long id;
        private String Username;
        private Roles role;
        private List<Long> changeRequestsId;

        public UserResponse(User user) {
            this.id = user.getId();
            this.Username = user.getUsername();
            this.role = user.getRoles();
            this.changeRequestsId = user.getChangeRequests().stream().map(
                    ChangeRequest::getId).toList();
        }



}
