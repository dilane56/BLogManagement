package org.kfokam48.blogmanagment.config;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title(" Blog Management API")
                        .description("API permettant aux utilisateurs de publier des articles et d’ajouter des commentaires")
                        .version("1.0.0")
                );
    }
}


