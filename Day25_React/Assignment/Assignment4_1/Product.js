function Product(props) {
  return (
    <div className="card m-3" style={{ width: "18rem" }}>
      <div className="card-header">
        Product Details
      </div>

      <div className="card-body">
        <p>Product Name : {props.productName}</p>
        <p>Price : ₹{props.price}</p>
        <p>Brand : {props.brand}</p>
        <p>Rating : {props.rating}</p>
        <p>Stock Status : {props.stockStatus}</p>
      </div>
    </div>
  );
}

export default Product;