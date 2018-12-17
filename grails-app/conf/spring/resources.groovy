// Place your Spring DSL code here
beans = {

    restAuthenticationSuccessHandler(LoginAuthenticationSucessHandler) {
        renderer = ref('accessTokenJsonRenderer')
    }
}
