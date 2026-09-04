package com.bykv.vk.openvk.preload.a;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class j<IN, OUT> extends l<IN, OUT> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f11692d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bykv.vk.openvk.preload.a.d
    public final Object a(b<OUT> bVar, IN in2) {
        new m(bVar);
        this.f11692d = a(in2);
        l.a aVar = a().get(this.f11692d);
        while (aVar != null) {
            List<h> list = aVar.f11695a;
            try {
                Object objA = c.a(list, bVar.f11688a, this).a(in2);
                return !l.a(list) ? objA : bVar.a(objA);
            } catch (i.a e10) {
                Throwable cause = e10.getCause();
                new m(bVar);
                this.f11692d = a(in2, cause, this.f11692d);
                aVar = a().get(this.f11692d);
            } catch (Throwable th2) {
                new m(bVar);
                this.f11692d = a(in2, th2, this.f11692d);
                aVar = a().get(this.f11692d);
            }
        }
        throw new IllegalArgumentException("can not found branch，branch name is：" + this.f11692d);
    }

    protected abstract String a(IN in2);

    protected abstract String a(IN in2, Throwable th2, String str);
}
