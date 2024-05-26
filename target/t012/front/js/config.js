
var projectName = '乾美美容院管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '医生',
	url: './pages/yisheng/list.jsp'
}, 
{
	name: '美容师',
	url: './pages/meirongshi/list.jsp'
}, 
{
	name: '产品信息',
	url: './pages/chanpinxinxi/list.jsp'
}, 
{
	name: '医美项目',
	url: './pages/yimeixiangmu/list.jsp'
}, 
{
	name: '美容项目',
	url: './pages/meirongxiangmu/list.jsp'
}, 

{
	name: '公告信息',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm23776/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-attentionfavor","buttons":["新增","查看","修改","删除"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"美容师","menuJump":"列表","tableName":"meirongshi"}],"menu":"美容师管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除"],"menu":"项目部门","menuJump":"列表","tableName":"xiangmubumen"}],"menu":"项目部门管理"},{"child":[{"appFrontIcon":"cuIcon-present","buttons":["新增","查看","修改","删除"],"menu":"项目类型","menuJump":"列表","tableName":"xiangmuleixing"}],"menu":"项目类型管理"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["新增","查看","修改","删除"],"menu":"产品分类","menuJump":"列表","tableName":"chanpinfenlei"}],"menu":"产品分类管理"},{"child":[{"appFrontIcon":"cuIcon-taxi","buttons":["新增","查看","修改","删除","查看评论"],"menu":"产品信息","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除","查看评论"],"menu":"医美项目","menuJump":"列表","tableName":"yimeixiangmu"}],"menu":"医美项目管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["新增","查看","修改","删除","查看评论"],"menu":"美容项目","menuJump":"列表","tableName":"meirongxiangmu"}],"menu":"美容项目管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除"],"menu":"预约美容","menuJump":"列表","tableName":"yuyuemeirong"}],"menu":"预约美容管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除"],"menu":"预约医美","menuJump":"列表","tableName":"yuyueyimei"}],"menu":"预约医美管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告信息","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"美容师列表","menuJump":"列表","tableName":"meirongshi"}],"menu":"美容师模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"产品信息列表","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","预约医美"],"menu":"医美项目列表","menuJump":"列表","tableName":"yimeixiangmu"}],"menu":"医美项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["预约美容","查看"],"menu":"美容项目列表","menuJump":"列表","tableName":"meirongxiangmu"}],"menu":"美容项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除","支付"],"menu":"预约美容","menuJump":"列表","tableName":"yuyuemeirong"}],"menu":"预约美容管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","支付"],"menu":"预约医美","menuJump":"列表","tableName":"yuyueyimei"}],"menu":"预约医美管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"美容师列表","menuJump":"列表","tableName":"meirongshi"}],"menu":"美容师模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"产品信息列表","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","预约医美"],"menu":"医美项目列表","menuJump":"列表","tableName":"yimeixiangmu"}],"menu":"医美项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["预约美容","查看"],"menu":"美容项目列表","menuJump":"列表","tableName":"meirongxiangmu"}],"menu":"美容项目模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"医美项目","menuJump":"列表","tableName":"yimeixiangmu"}],"menu":"医美项目管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","审核"],"menu":"预约医美","menuJump":"列表","tableName":"yuyueyimei"}],"menu":"预约医美管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"美容师列表","menuJump":"列表","tableName":"meirongshi"}],"menu":"美容师模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"产品信息列表","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","预约医美"],"menu":"医美项目列表","menuJump":"列表","tableName":"yimeixiangmu"}],"menu":"医美项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["预约美容","查看"],"menu":"美容项目列表","menuJump":"列表","tableName":"meirongxiangmu"}],"menu":"美容项目模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医生","tableName":"yisheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看"],"menu":"美容项目","menuJump":"列表","tableName":"meirongxiangmu"}],"menu":"美容项目管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","审核"],"menu":"预约美容","menuJump":"列表","tableName":"yuyuemeirong"}],"menu":"预约美容管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"医生列表","menuJump":"列表","tableName":"yisheng"}],"menu":"医生模块"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["查看"],"menu":"美容师列表","menuJump":"列表","tableName":"meirongshi"}],"menu":"美容师模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看"],"menu":"产品信息列表","menuJump":"列表","tableName":"chanpinxinxi"}],"menu":"产品信息模块"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","预约医美"],"menu":"医美项目列表","menuJump":"列表","tableName":"yimeixiangmu"}],"menu":"医美项目模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["预约美容","查看"],"menu":"美容项目列表","menuJump":"列表","tableName":"meirongxiangmu"}],"menu":"美容项目模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"美容师","tableName":"meirongshi"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
