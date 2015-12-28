# note

`@PropertySource("classpath:application.properties")` 和 `PropertySourcesPlaceholderConfigurer` 只用一个

如果用PropertySourcesPlaceholderConfigurer, env会为空
	
	@Autowired
    Environment env; //null
    
    @Bean
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    
如果在构造函数中用@Value, 配合`@ComponentScan` 和 `@Autowired` 会报找不到默认构造函数的错误，解决办法：

	
	@Autowired
    public DiskPlayer(@Value("${disc.artist}") String player) {
        this.player = player;
    }

    
    