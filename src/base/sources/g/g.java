package g;

import android.content.Context;
import android.content.Intent;
import f.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g extends g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f38829a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // g.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, h input) {
        s.h(context, "context");
        s.h(input, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
        s.g(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // g.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public f.a c(int i10, Intent intent) {
        return new f.a(i10, intent);
    }
}
