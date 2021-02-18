const {HashRouter, Switch, Route, Link,useHistory,useParams} = ReactRouterDOM;
const {Menu,Icon,Tooltip} =antd;
const {SubMenu}=Menu;

/**
 * header里的先放这里了
 */
let button =document.getElementById("searchbar-button");
button.addEventListener("click",(event)=>{
    let str=document.getElementById("searchbar-input").value;
    window.open('https://cn.bing.com/search?q='+str+' NBA');
});

/**
 * Router
 */
class App extends React.Component {
    constructor(props) {
        super(props);
        this.state={
            MenuDisabled:true, //战队资料和球员资料按钮是否启用
            winner:"",
            loser:""
        }
    }

    changeMenuDisabled(winner,loser){
        if(this.state.MenuDisabled==true){
            this.setState({
                MenuDisabled: false,
                winner:winner,
                loser:loser
            });
        }
    }

    render() {
        return (
            <HashRouter >
                <div>
                    <HeaderMenu
                        onClick={(winner,loser)=>this.changeMenuDisabled(winner,loser)}
                        MenuDisabled={this.state.MenuDisabled}
                        history={this.props.history}
                        winner={this.state.winner}
                        loser={this.state.loser}
                    />

                    <Switch>
                        <Route exact path="/">
                            <Home />
                        </Route>
                        <Route path="/player">
                            <Player />
                        </Route>
                        <Route path="/playoff/:winner/:loser" component={Playoff} />
                        {/*    <Playoff />*/}
                        {/*</Route>*/}
                        <Route path="/team">
                            <Team />
                        </Route>
                    </Switch>
                </div>
            </HashRouter>
        );
    }
}




/**
 * HeaderMenu
 */
class HeaderMenu extends React.Component{
    constructor(props) {
        super(props);
        this.state={
            winner:"winner",
            loser:"loser"
        }
        this.linkurl="";
    }

    linkto(){
        this.props.onClick(this.state.winner,this.state.loser);
        this.linkurl="/playoff/"+this.state.winner+"/"+this.state.loser;
    }

    render(){
        const tooltip=this.state.winner+"/"+this.state.loser;
        return (
            <div >
                <Menu mode="horizontal" theme="dark"  >
                    <SubMenu key="round1" title="第一轮" style={{marginLeft:20}}>
                        <Menu.ItemGroup title="西部">
                            <Menu.Item key="round1:1" onClick={()=>this.linkto()}><Link to={this.linkurl}>西部第1 vs 西部第8</Link> </Menu.Item>
                            <Menu.Item key="round1:2" onClick={()=>this.linkto()}>西部第2 vs 西部第7</Menu.Item>
                            <Menu.Item key="round1:3" onClick={()=>this.linkto()}>西部第3 vs 西部第6</Menu.Item>
                            <Menu.Item key="round1:4" onClick={()=>this.linkto()}>西部第4 vs 西部第5</Menu.Item>
                        </Menu.ItemGroup>
                        <Menu.ItemGroup title="东部">
                            <Menu.Item key="round1:5" onClick={()=>this.linkto()}>东部第1 vs 东部第8</Menu.Item>
                            <Menu.Item key="round1:6" onClick={()=>this.linkto()}>东部第2 vs 东部第7</Menu.Item>
                            <Menu.Item key="round1:7" onClick={()=>this.linkto()}>东部第3 vs 东部第6</Menu.Item>
                            <Menu.Item key="round1:8" onClick={()=>this.linkto()}>东部第4 vs 东部第5</Menu.Item>
                        </Menu.ItemGroup>
                    </SubMenu>
                    <SubMenu key="round2" title="第二轮" style={{marginLeft:20}}>
                        <Menu.ItemGroup title="西部">
                            <Menu.Item key="round2:1" onClick={()=>this.linkto()}>西部第1 vs 西部第4</Menu.Item>
                            <Menu.Item key="round2:2" onClick={()=>this.linkto()}>西部第2 vs 西部第3</Menu.Item>
                        </Menu.ItemGroup>
                        <Menu.ItemGroup title="东部">
                            <Menu.Item key="round2:3" onClick={()=>this.linkto()}>东部第1 vs 东部第4</Menu.Item>
                            <Menu.Item key="round2:4" onClick={()=>this.linkto()}>东部第2 vs 东部第3</Menu.Item>
                        </Menu.ItemGroup>
                    </SubMenu>
                    <SubMenu key="round3" title="第三轮" style={{marginLeft:20}}>
                        <Menu.Item >
                            <i className="ai-smile-o" ></i>西决
                        </Menu.Item>
                        <Menu.Item >
                            <i className="ai-smile-o" ></i>东决
                        </Menu.Item>
                    </SubMenu>
                    <Menu.Item key="Two" style={{marginLeft:20}}  disabled={this.props.MenuDisabled}>
                        <Tooltip title={tooltip}>
                        <i className="ai-smile"></i>  战队资料
                        </Tooltip>
                    </Menu.Item>
                    <Menu.Item key="Three" style={{marginLeft:20}} disabled={this.props.MenuDisabled}>
                        <i className="ai-smile"></i>  球员资料
                    </Menu.Item>
                </Menu>
            </div>
        );
    }
}

/**
 * home
 */
class Home extends React.Component{
    constructor(props) {
        super(props);
    }

    render(){
        return(
            <div>
                <p>home</p>
            </div>
        );
    }
}

/**
 * player
 */
class Player extends React.Component{
    constructor(props) {
        super(props);
    }

    render(){
        return (
            <div>
                <p>player</p>
            </div>
        );
    }
}

/**
 * playoff
 */
class Playoff extends React.Component{
    constructor(props) {
        super(props);
    }

    render(){
        let winner=this.props.match.params.winner;
        let loser=this.props.match.params.loser;
        return (
            <div>
                <p>{loser}</p>
            </div>
        );
    }
}

/**
 * team
 */
class Team extends React.Component{
    constructor(props) {
        super(props);
    }

    render(){
        return (
            <div>
                <p>team</p>
            </div>
        );
    }
}








ReactDOM.render(<App/>, document.getElementById('root'));

