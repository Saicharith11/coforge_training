import { Component } from "react";

// day 2
class Counter extends Component {
    constructor(props) {
        super(props)
        this.state = {
            count : 0
        }
    }
     increment = () => {
            this.setState({
                count : this.state.count + 1
            });
        }
    decrement = () => {
        this.setState({
            count : this.state.count - 1
        });
    }

    render() {
        return (
            <>
            <h1>For Count</h1>
            <h2>{this.state.count}</h2>
            <button onClick={this.increment}>Increment</button>
            <button onClick={this.decrement}>Decrement</button>
            </>

        );
    }
}

export default Counter;