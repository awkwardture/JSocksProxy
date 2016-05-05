package iantong.net.jsocksproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.alexkasko.installer.DaemonLauncher;

import nu.najt.kecon.jsocksproxy.JSocksProxy;


public class SocksProxyService implements DaemonLauncher {

	static Logger logger = LoggerFactory.getLogger(SocksProxyService.class);


	@Override
	public void startDaemon() {
		JSocksProxy.startService();
		
	}


	@Override
	public void stopDaemon() {
		JSocksProxy.stopService();
	}

}