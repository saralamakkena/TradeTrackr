package dev.tradetrackr.user;

import dev.tradetrackr.user.dto.CreateUserRequest;
import dev.tradetrackr.user.dto.UserResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/api/users")
public class UserController {

  private final UserRepo repo;
  public UserController(UserRepo repo){ this.repo = repo; }

  @PostMapping
  public ResponseEntity<UserResponse> create(@Valid @RequestBody CreateUserRequest req){
    var saved = repo.save(UserEntity.builder().email(req.email()).fullName(req.fullName()).build());
    var dto = UserMapper.INSTANCE.toDto(saved);
    return ResponseEntity.created(URI.create("/api/users/" + saved.getId())).body(dto);
  }

  @GetMapping("/{id}")
  public ResponseEntity<UserResponse> get(@PathVariable Long id){
    return repo.findById(id)
      .map(UserMapper.INSTANCE::toDto)
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }
}
