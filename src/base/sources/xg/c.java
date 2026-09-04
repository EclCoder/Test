package xg;

import com.hecorat.screenrecorder.free.services.RecordService;
import qg.d;
import zg.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static void a(RecordService recordService, ug.a aVar) {
        recordService.azNotificationManager = aVar;
    }

    public static void b(RecordService recordService, p pVar) {
        recordService.globalBubbleManager = pVar;
    }

    public static void c(RecordService recordService, qg.a aVar) {
        recordService.logoManager = aVar;
    }

    public static void d(RecordService recordService, lg.a aVar) {
        recordService.preferenceManager = aVar;
    }

    public static void e(RecordService recordService, dk.a aVar) {
        recordService.recordingController = aVar;
    }

    public static void f(RecordService recordService, dk.a aVar) {
        recordService.screenshotController = aVar;
    }

    public static void g(RecordService recordService, d dVar) {
        recordService.watermarkManager = dVar;
    }
}
