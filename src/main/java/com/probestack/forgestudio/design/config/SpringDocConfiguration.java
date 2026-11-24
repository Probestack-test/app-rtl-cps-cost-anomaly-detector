package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.OAuthFlow;
import io.swagger.v3.oas.models.security.OAuthFlows;
import io.swagger.v3.oas.models.security.Scopes;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Cost Anomaly Detector")
                                .description("Real-time cloud cost anomaly detection and forensics platform. Detects  unexpected spend spikes within minutes (not at end-of-month billing) by  analyzing usage patterns across every AWS, GCP, and Azure service. Uses  ML-based baselines, seasonal patterns, and business context to distinguish  real anomalies from expected events (Black Friday, product launches).  Provides root-cause attribution — which resource, which team, which change  caused the spike. Enables engineers to act before a $500/day misconfiguration  becomes a $50,000 monthly bill. ")
                                .termsOfService("https://forgesphere.example.com/terms")
                                .contact(
                                        new Contact()
                                                .name("ForgeSphere FinOps Team")
                                                .email("finops@forgesphere.example.com")
                                )
                                .version("1.0.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("bearerAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                        .flows(new OAuthFlows().clientCredentials(
                                                new OAuthFlow()
                                                        .tokenUrl("/oauth2/token")
                                                        .scopes(new Scopes()
                                                                .addString("api.read", "Read access to the API")
                                                                .addString("api.write", "Write access to the API"))))
                                )
                )
        ;
    }
}
