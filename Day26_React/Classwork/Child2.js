import { Component } from "react";

class Child2 extends Component {
    render() {
        return (
            <>
            <p>Welcome to Child2</p>
            <br></br>
            <p>Name : {this.props.name}</p>



            </>
        );
    }

}

Child2.defaultProps = {
    name : "Vijay"

};


export default Child2;





// if mail is comming take else take some value as default

/*
            <p>Name : {this.props.name}</p>
            <p>Email id : {this.props.mail}</p>
            */