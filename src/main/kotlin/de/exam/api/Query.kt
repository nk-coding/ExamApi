package de.exam.api

import com.expediagroup.graphql.annotations.GraphQLDescription
import com.expediagroup.graphql.spring.operations.Query
import org.springframework.stereotype.Component

@Component
@GraphQLDescription("Base query")
class Query : Query {
    @GraphQLDescription("Get your exam result")
    fun exam() : String {
        return if (Math.random() > 0.8) "Glückwunsch: bestanden" else "Schade, try again"
    }
}