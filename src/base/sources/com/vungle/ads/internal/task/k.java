package com.vungle.ads.internal.task;

import android.content.Context;
import com.vungle.ads.internal.util.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class k implements c {
    private final Context context;
    private final s pathProvider;

    public k(Context context, s pathProvider) {
        kotlin.jvm.internal.s.h(context, "context");
        kotlin.jvm.internal.s.h(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    @Override // com.vungle.ads.internal.task.c
    public b create(String tag) throws UnknownTagException {
        kotlin.jvm.internal.s.h(tag, "tag");
        if (tag.length() == 0) {
            throw new UnknownTagException("Job tag is null");
        }
        if (kotlin.jvm.internal.s.c(tag, a.TAG)) {
            return new a(this.context, this.pathProvider);
        }
        if (kotlin.jvm.internal.s.c(tag, i.TAG)) {
            return new i(this.context, this.pathProvider);
        }
        throw new UnknownTagException("Unknown Job Type " + tag);
    }

    public final Context getContext() {
        return this.context;
    }

    public final s getPathProvider() {
        return this.pathProvider;
    }
}
