package os.admin.job;

import java.util.HashMap;
import java.util.Map;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import os.admin.application.CmdApp;
import osgi.enroute.scheduler.api.CronJob;

@Component(property=CronJob.CRON+"=*/20 * * * * ?")
public class CheckJob implements CronJob<Object> {

	// �쳣�ָ�
	public static Map<String,Long> checktab=new HashMap<>();
		
	private boolean finish=true;
	CmdApp cmdApp=null;
	@Reference void setCmdApp(CmdApp cmdApp){
		this.cmdApp=cmdApp;
	}
	public void run(Object object) {
		// ͨ��finish���Ƽ��Ƶ��,�����һ�λָ�����δ���,�򲻽�����һ�λָ�����
		if(finish==true){
			finish=false;
			cmdApp.check();
			finish=true;
		}
	}
}