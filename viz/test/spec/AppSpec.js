import * as app from "../../app.js";

describe("App", function () {
  beforeEach(function () {});

  describe("getRandom", function () {
    it("should be able to get random number >= min", function () {
      const min = 0;
      const max = 100;
      const numIterations = 100;

      for (let i = 0; i <= numIterations; i++) {
        // test
        const result = app.getRandom(min, max);
        expect(result >= min).toBeTruthy();
      }
    });

    it("should be able to get random number <= max", function () {
      const min = 0;
      const max = 100;
      const numIterations = 100;

      for (let i = 0; i <= numIterations; i++) {
        // test
        const result = app.getRandom(min, max);
        expect(result <= max).toBeTruthy();
      }
    });
  });
});
