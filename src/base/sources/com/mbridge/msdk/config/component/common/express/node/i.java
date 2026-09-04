package com.mbridge.msdk.config.component.common.express.node;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f28594a;

    public i(String str) {
        this.f28594a = str;
    }

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objSubstring;
        if (this.f28594a.startsWith("$")) {
            objSubstring = com.mbridge.msdk.config.component.common.express.c.a(this.f28594a, aVar);
        } else if (this.f28594a.startsWith("\\") && this.f28594a.endsWith("\\\"")) {
            StringBuilder sb2 = new StringBuilder();
            String str = this.f28594a;
            sb2.append(str.substring(1, str.length() - 2));
            sb2.append("\"");
            objSubstring = sb2.toString();
        } else if (this.f28594a.startsWith("\"") && this.f28594a.endsWith("\"")) {
            String str2 = this.f28594a;
            objSubstring = str2.substring(1, str2.length() - 1);
        } else {
            objSubstring = this.f28594a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objSubstring;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.f28594a.substring(1));
        return aVar2;
    }
}
