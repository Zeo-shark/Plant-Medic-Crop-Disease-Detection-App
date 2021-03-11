const http = require("http");
const express = require("express");

const app = express();

const PORT = process.env.PORT || 5000;

if (process.env.NODE_ENV === "production") {
  app.use(express.static("client/build"));
}
const server = http.createServer(app);
server.listen(PORT, () => {
  console.log(`server is running on localhost:${PORT}`);
});
