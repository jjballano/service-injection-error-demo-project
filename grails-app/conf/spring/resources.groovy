// Place your Spring DSL code here
beans = {

    restAuthenticationSuccessHandler(LoginAuthenticationSucessHandler) {
        renderer = ref('accessTokenJsonRenderer')
// Comment following line and the test will pass
        userService = ref('userService')
    }
}
