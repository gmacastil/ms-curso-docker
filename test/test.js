import http from "k6/http";

export const options = {
  iterations: 1,
};

export default function () {
  const response = http.get("http://13.77.65.204:8080/");
}