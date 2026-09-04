package rh;

import android.content.Context;
import com.hecorat.screenrecorder.free.R;
import gl.r;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c {
    public static final List a(Context context) {
        s.h(context, "context");
        return r.o(b(context), new qh.h(16, 9, "16:9", Integer.valueOf(R.drawable.ic_youtube), false, 16, null), new qh.h(9, 16, "9:16", Integer.valueOf(R.drawable.ic_tiktok), false, 16, null), new qh.h(1, 1, "1:1", Integer.valueOf(R.drawable.ic_instagram), false, 16, null), new qh.h(4, 3, "4:3", null, false, 16, null), new qh.h(2, 1, "2:1", null, false, 16, null), new qh.h(4, 5, "4:5", null, false, 16, null), new qh.h(5, 4, "5:4", null, false, 16, null), new qh.h(3, 4, "3:4", null, false, 16, null), new qh.h(2, 3, "2:3", null, false, 16, null), new qh.h(3, 2, "3:2", null, false, 16, null), new qh.h(1, 2, "1:2", null, false, 16, null));
    }

    public static final qh.h b(Context context) {
        s.h(context, "context");
        String string = context.getString(R.string.free_crop);
        s.g(string, "getString(...)");
        return new qh.h(0, 0, string, Integer.valueOf(R.drawable.ic_baseline_crop_free_24), false, 16, null);
    }
}
