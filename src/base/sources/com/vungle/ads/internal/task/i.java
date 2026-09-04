package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.util.s;
import fl.o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i implements com.vungle.ads.internal.task.b {
    public static final a Companion = new a(null);
    public static final String TAG = "ResendTpatJob";
    private final Context context;
    private final s pathProvider;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d makeJobInfo() {
            return new d(i.TAG).setPriority(0).setUpdateCurrent(true);
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b extends t implements tl.a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.$context = context;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.i, java.lang.Object] */
        @Override // tl.a
        public final com.vungle.ads.internal.network.i invoke() {
            return ServiceLocator.Companion.getInstance(this.$context).getService(com.vungle.ads.internal.network.i.class);
        }
    }

    public i(Context context, s pathProvider) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    /* JADX INFO: renamed from: onRunJob$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.i m147onRunJob$lambda0(fl.k kVar) {
        return (com.vungle.ads.internal.network.i) kVar.getValue();
    }

    public final Context getContext() {
        return this.context;
    }

    public final s getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.b
    public int onRunJob(Bundle bundle, f jobRunner) {
        kotlin.jvm.internal.s.h(bundle, "bundle");
        kotlin.jvm.internal.s.h(jobRunner, "jobRunner");
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        m147onRunJob$lambda0(fl.l.a(o.SYNCHRONIZED, new b(this.context))).resendStoredTpats$vungle_ads_release();
        return 0;
    }
}
