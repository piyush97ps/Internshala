const puppeteer = require('puppeteer');

(async () => {
	const browser = await puppeteer.launch({headless: false});
	const page = await browser.newPage();

	/*
	 *	defining the viewport for the screenshort size and page size
	 *	by default viewport is 800px by 600px
	 */
	// var viewport = { 
	// 	width: 960,
	// 	height: 700,
	// }
	// page.setViewport(viewport)
	await page.goto("https://www.google.com/")
	await page.screenshot({path: "google.png"})
	await browser.close();

})();