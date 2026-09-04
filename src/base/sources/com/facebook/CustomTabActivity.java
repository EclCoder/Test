package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.hecorat.screenrecorder.free.helpers.webserver.ga.CnrFvGiAIjOOU;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.shake.hNcq.sYaE;
import com.pairip.VMRunner;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/g0;", "onCreate", "(Landroid/os/Bundle;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", DataSchemeDataSource.SCHEME_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "onDestroy", "Landroid/content/BroadcastReceiver;", "a", "Landroid/content/BroadcastReceiver;", "closeReceiver", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomTabActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f14823c = CustomTabActivity.class.getSimpleName() + ".action_customTabRedirect";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f14824d = CustomTabActivity.class.getSimpleName() + ".action_destroy";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public BroadcastReceiver closeReceiver;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("M2dqWecH3x98q7ej", new Object[]{this, context, intent});
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 0) {
            Intent intent = new Intent(f14823c);
            intent.putExtra(CustomTabMainActivity.f14831g, getIntent().getDataString());
            s1.a.b(this).d(intent);
            b bVar = new b();
            s1.a.b(this).c(bVar, new IntentFilter(f14824d));
            this.closeReceiver = bVar;
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) throws IllegalAccessException, InvocationTargetException {
        sYaE.MRc.invoke(null, this, savedInstanceState);
    }

    @Override // android.app.Activity
    protected void onDestroy() throws IllegalAccessException, InvocationTargetException {
        CnrFvGiAIjOOU.fbKdrrSFWlpHR.invoke(null, this);
    }
}
