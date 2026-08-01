import { Component } from "react";
// day 2
class Calculator extends Component {
            constructor(props) {
            super(props);
            this.state = {
                n1 : 0,
                n2 : 0,
                res : ""
            }
        }
        addition = () => {
            this.setState({
                res :"Addition = " + (parseInt(this.state.n1) + parseInt(this.state.n2))

            });
        }

        subraction = () => {
            this.setState({
                res : "Subraction = " + ((parseInt(this.state.n1) - parseInt(this.state.n2)))
            });
        }
        
        mult = () => {
            this.setState({
                res : "Multplication = " + ((parseInt(this.state.n1) * parseInt(this.state.n2)))
            });
        }
        div = () => {
            this.setState({
                res : "Division = " + ((parseInt(this.state.n1) / parseInt(this.state.n2)))
            });
        }




    render() {
        return(
            <>
                <h1> Calc Application</h1>
                <b>Enter Number 1 : <input type="text" value={this.state.n1} onChange={(event) => this.setState({n1 : event.target.value})} /></b>
                <br /><br />
                <b>Enter Number 2 : <input type="text" value={this.state.n2} onChange={(event) => this.setState({n2 : event.target.value})} /></b>
                <br /><br />
                <button onClick={this.addition}>Addition</button>
                <button onClick={this.subraction}>Subraction </button>
                <button onClick={this.mult}>Multplication </button>
                <button onClick={this.div}>Division </button>
                <br></br>
                <h1>{this.state.res}</h1>
            </>

        );
    }
}

export default Calculator;