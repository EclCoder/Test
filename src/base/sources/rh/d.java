package rh;

import android.content.Context;
import com.hecorat.screenrecorder.free.R;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import gl.r;
import java.util.List;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d {
    public static final qh.d a(Context context) {
        s.h(context, "context");
        String string = context.getString(R.string.standard);
        s.g(string, "getString(...)");
        return new qh.d(PsExtractor.VIDEO_STREAM_MASK, "240P", string);
    }

    public static final List b(Context context) {
        s.h(context, "context");
        qh.d dVarA = a(context);
        String string = context.getString(R.string.high);
        s.g(string, "getString(...)");
        qh.d dVar = new qh.d(360, "360P", string);
        String string2 = context.getString(R.string.very_high);
        s.g(string2, "getString(...)");
        qh.d dVar2 = new qh.d(480, "480P", string2);
        String string3 = context.getString(R.string.ultra_high);
        s.g(string3, "getString(...)");
        return r.o(dVarA, dVar, dVar2, new qh.d(640, "640P", string3));
    }
}
