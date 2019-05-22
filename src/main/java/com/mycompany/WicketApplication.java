package com.mycompany;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.resource.CssResourceReference;
import org.apache.wicket.resource.CssUrlReplacer;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 * 
 * @see com.mycompany.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

		getResourceSettings().setCssCompressor(new CssUrlReplacer());

		getResourceBundles().addCssBundle(WicketApplication.class, "testBundle", new CssResourceReference(WicketApplication.class, "css/cssFile1.css"),
				new CssResourceReference(WicketApplication.class, "css/cssFile2.css"));
	}
}
