const config = require('./scalajs.webpack.config');

const HtmlWebpackPlugin = require('html-webpack-plugin');

module.exports = config;

module.exports.plugins = [
  new HtmlWebpackPlugin({
    title: "scalajs-example"
  })
];