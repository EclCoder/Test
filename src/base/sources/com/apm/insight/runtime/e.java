package com.apm.insight.runtime;

import com.apm.insight.entity.Header;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f10973b = new e() { // from class: com.apm.insight.runtime.e.1

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Header f10975a = null;

        @Override // com.apm.insight.runtime.e
        public final Object b(String str) {
            if (this.f10975a == null) {
                this.f10975a = Header.b(com.apm.insight.e.g());
            }
            return this.f10975a.f().opt(str);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10974a;

    e() {
        this(f10973b);
    }

    public Object a(String str) {
        e eVar = this.f10974a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    public Object b(String str) {
        e eVar = this.f10974a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.f10974a = eVar;
    }
}
