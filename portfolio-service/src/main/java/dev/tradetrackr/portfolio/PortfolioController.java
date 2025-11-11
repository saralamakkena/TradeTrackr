package dev.tradetrackr.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/portfolios")
public class PortfolioController {
  @GetMapping("/health")
  public String health(){ return "portfolio-ok"; }
}
