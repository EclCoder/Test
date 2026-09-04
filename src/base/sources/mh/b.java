package mh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.hecorat.screenrecorder.free.ui.permission.ProjectionActivity;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b {
    public static final void a(Context context, String action, int i10) {
        s.h(context, "context");
        s.h(action, "action");
        if (ef.a.j().compareAndSet(false, true)) {
            Intent intent = new Intent(context, (Class<?>) ProjectionActivity.class);
            intent.setAction(action);
            intent.putExtra("projection_retries_left", i10);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }
    }

    public static /* synthetic */ void b(Context context, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 1;
        }
        a(context, str, i10);
    }
}
