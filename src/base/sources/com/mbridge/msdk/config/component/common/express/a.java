package com.mbridge.msdk.config.component.common.express;

import com.mbridge.msdk.config.component.common.express.node.h;
import com.mbridge.msdk.config.component.common.express.node.i;
import com.mbridge.msdk.config.component.common.express.node.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import r7.pgx.XTkUEXuiK;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Integer> f28547a = g.a(new Map.Entry[]{f.a("=", 0), f.a("+=", 0), f.a("-=", 0), f.a("*=", 0), f.a("/=", 0), f.a("%=", 0), f.a(com.mbridge.msdk.config.component.common.util.c.c("883"), 1), f.a(com.mbridge.msdk.config.component.common.util.c.c("882"), 2), f.a("==", 3), f.a("!=", 3), f.a(">", 4), f.a("<", 4), f.a(">=", 4), f.a("<=", 4), f.a("in", 4), f.a("IN", 4), f.a("+", 5), f.a("-", 5), f.a("*", 6), f.a("/", 6), f.a("%", 6)});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f28548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f28549c;

    private List<String> b(String str) {
        int i10;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        boolean z10 = false;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt == '\"') {
                sb2.append(cCharAt);
                z10 = !z10;
            } else if (z10) {
                sb2.append(cCharAt);
            } else if (Character.isWhitespace(cCharAt)) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else if ("().,!><=|&+-*/%{}[]:".indexOf(cCharAt) >= 0) {
                if (sb2.length() > 0) {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
                if ((cCharAt == '!' || cCharAt == '=' || cCharAt == '>' || cCharAt == '<' || cCharAt == '+' || cCharAt == '-' || cCharAt == '*' || cCharAt == '/' || cCharAt == '%') && (i10 = i11 + 1) < length && str.charAt(i10) == '=') {
                    arrayList.add(cCharAt + "=");
                    i11 = i10;
                } else {
                    arrayList.add(String.valueOf(cCharAt));
                }
            } else {
                sb2.append(cCharAt);
            }
            i11++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    private com.mbridge.msdk.config.component.common.express.node.d c(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        if (!this.f28548b.get(this.f28549c).equals("(")) {
            return a(dVar, z10);
        }
        this.f28549c++;
        com.mbridge.msdk.config.component.common.express.node.d dVarB = b(dVar, true);
        int i10 = this.f28549c + 1;
        this.f28549c = i10;
        return i10 > this.f28548b.size() - 1 ? dVarB : b(dVarB, false);
    }

    public com.mbridge.msdk.config.component.common.express.node.d a(String str) {
        this.f28548b = b(str);
        this.f28549c = 0;
        return b(null, false);
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, int i10, boolean z10) {
        String str;
        Integer num;
        com.mbridge.msdk.config.component.common.express.node.d cVar;
        com.mbridge.msdk.config.component.common.express.node.d dVarC = c(dVar, z10);
        while (this.f28549c < this.f28548b.size() && (num = this.f28547a.get((str = this.f28548b.get(this.f28549c)))) != null && num.intValue() >= i10) {
            int i11 = this.f28549c + 1;
            this.f28549c = i11;
            if (i11 > this.f28548b.size() - 1) {
                break;
            }
            com.mbridge.msdk.config.component.common.express.node.d dVarA = a(dVar, num.intValue() + 1, z10);
            if (str.matches("=|\\+=|-=|\\*=|/=|%=")) {
                cVar = new com.mbridge.msdk.config.component.common.express.node.b(str, dVarC, dVarA);
            } else {
                cVar = new com.mbridge.msdk.config.component.common.express.node.c(str, dVarC, dVarA);
            }
            dVarC = cVar;
        }
        return dVarC;
    }

    private com.mbridge.msdk.config.component.common.express.node.d a(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        com.mbridge.msdk.config.component.common.express.node.d jVar;
        com.mbridge.msdk.config.component.common.express.node.e eVar;
        com.mbridge.msdk.config.component.common.express.node.d aVar;
        int i10;
        if (dVar == null) {
            List<String> list = this.f28548b;
            int i11 = this.f28549c;
            this.f28549c = i11 + 1;
            dVar = new i(list.get(i11));
        }
        int i12 = this.f28549c;
        while (this.f28549c < this.f28548b.size()) {
            boolean z11 = true;
            String str = "";
            if (this.f28548b.get(this.f28549c - 1).startsWith("$") && this.f28549c >= i12) {
                while (true) {
                    if (this.f28549c - 1 < this.f28548b.size()) {
                        String str2 = this.f28548b.get(this.f28549c - 1);
                        if (this.f28549c != this.f28548b.size() && (this.f28549c >= this.f28548b.size() || (XTkUEXuiK.gzhbnqPHxT.indexOf(this.f28548b.get(this.f28549c).charAt(0)) < 0 && !this.f28548b.get(this.f28549c).equals(com.mbridge.msdk.config.component.common.util.c.c("883")) && !this.f28548b.get(this.f28549c).equals(com.mbridge.msdk.config.component.common.util.c.c("882")) && !this.f28548b.get(this.f28549c).equals("IN")))) {
                            String str3 = this.f28548b.get(this.f28549c);
                            if (this.f28547a.containsKey(this.f28548b.get(this.f28549c)) || "/".indexOf(str3.charAt(0)) == 0) {
                                break;
                            }
                            if ("{[(.".indexOf(str3.charAt(0)) >= 0) {
                                this.f28549c = i12;
                                i12++;
                            } else {
                                str = str + str2;
                                this.f28549c++;
                            }
                        } else {
                            dVar = new i(str + str2);
                            break;
                        }
                    }
                    z11 = false;
                    break;
                }
                if (z11) {
                    this.f28549c = i12;
                    return dVar;
                }
            } else if (this.f28548b.get(this.f28549c).equals(".")) {
                i12 = this.f28549c;
                List<String> list2 = this.f28548b;
                this.f28549c = i12 + 2;
                String str4 = list2.get(i12 + 1);
                if (this.f28549c < this.f28548b.size() && this.f28548b.get(this.f28549c).equals("(")) {
                    this.f28549c++;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 1;
                    while (this.f28549c < this.f28548b.size() && i13 > 0) {
                        String str5 = this.f28548b.get(this.f28549c);
                        if (str5.equals("(")) {
                            i13++;
                        } else if (str5.equals(")")) {
                            i13--;
                        }
                        if (i13 > 0) {
                            if (str5.equals(",") && i13 == 1) {
                                arrayList.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList2)));
                                arrayList2.clear();
                            } else {
                                arrayList2.add(str5);
                            }
                        }
                        this.f28549c++;
                    }
                    if (!arrayList2.isEmpty()) {
                        arrayList.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList2)));
                    }
                    eVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, str4, arrayList);
                    dVar = eVar;
                } else {
                    jVar = new j(dVar, str4);
                    dVar = jVar;
                }
            } else if (!this.f28548b.get(this.f28549c - 1).equals("[") && !this.f28548b.get(this.f28549c).equals("[")) {
                if (!this.f28548b.get(this.f28549c - 1).equals("{") && !this.f28548b.get(this.f28549c).equals("{")) {
                    if (this.f28548b.get(this.f28549c).equals(":")) {
                        i12 = this.f28549c;
                        String str6 = this.f28548b.get(i12 - 1);
                        int i14 = this.f28549c;
                        List<String> list3 = this.f28548b;
                        this.f28549c = i14 + 2;
                        jVar = new com.mbridge.msdk.config.component.common.express.node.g(new a().a(com.bytedance.sdk.openadsdk.core.model.a.a(" ", new CharSequence[]{str6})), new a().a(com.bytedance.sdk.openadsdk.core.model.a.a(" ", new CharSequence[]{list3.get(i14 + 1)})));
                        dVar = jVar;
                    } else {
                        i12 = this.f28549c;
                        String str7 = this.f28548b.get(i12 - 1);
                        if (this.f28549c < this.f28548b.size() && this.f28548b.get(this.f28549c).equals("(")) {
                            i iVar = new i("");
                            this.f28549c++;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            int i15 = 1;
                            while (this.f28549c < this.f28548b.size() && i15 > 0) {
                                String str8 = this.f28548b.get(this.f28549c);
                                if (str8.equals("(")) {
                                    i15++;
                                } else if (str8.equals(")")) {
                                    i15--;
                                }
                                if (i15 > 0) {
                                    if (str8.equals(",") && i15 == 1) {
                                        arrayList3.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList4)));
                                        arrayList4.clear();
                                    } else {
                                        arrayList4.add(str8);
                                    }
                                }
                                this.f28549c++;
                            }
                            if (!arrayList4.isEmpty()) {
                                arrayList3.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList4)));
                            }
                            eVar = new com.mbridge.msdk.config.component.common.express.node.e(iVar, str7, arrayList3);
                            dVar = eVar;
                        } else {
                            if (this.f28549c >= this.f28548b.size() || this.f28547a.containsKey(this.f28548b.get(this.f28549c)) || "/".indexOf(str7.charAt(0)) == 0 || (z10 && ")".indexOf(this.f28548b.get(this.f28549c).charAt(0)) >= 0)) {
                                break;
                            }
                            this.f28549c++;
                        }
                    }
                } else {
                    if (this.f28548b.get(this.f28549c).equals("{")) {
                        int i16 = this.f28549c;
                        this.f28549c = i16 + 1;
                        i12 = i16;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    int i17 = 1;
                    while (this.f28549c < this.f28548b.size() && i17 > 0) {
                        String str9 = this.f28548b.get(this.f28549c);
                        if (str9.equals("{")) {
                            i17++;
                        } else if (str9.equals("}")) {
                            i17--;
                        }
                        if (i17 > 0) {
                            if (str9.equals(",") && i17 == 1) {
                                arrayList5.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList6)));
                                arrayList6.clear();
                            } else {
                                arrayList6.add(str9);
                            }
                        }
                        this.f28549c++;
                    }
                    if (!arrayList6.isEmpty()) {
                        arrayList5.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList6)));
                    }
                    aVar = new h(arrayList5);
                    dVar = aVar;
                }
            } else {
                if (this.f28548b.get(this.f28549c).equals("[")) {
                    i12 = this.f28549c;
                    this.f28549c = i12 + 1;
                }
                if (this.f28549c < this.f28548b.size() && this.f28548b.get(this.f28549c).equals("?")) {
                    this.f28549c++;
                    ArrayList arrayList7 = new ArrayList();
                    int i18 = 1;
                    while (this.f28549c < this.f28548b.size() && i18 > 0) {
                        String str10 = this.f28548b.get(this.f28549c);
                        if (str10.equals("[")) {
                            i18++;
                        } else if (str10.equals("]")) {
                            i18--;
                        }
                        if (i18 > 0) {
                            arrayList7.add(str10);
                        }
                        this.f28549c++;
                    }
                    com.mbridge.msdk.config.component.common.express.node.d dVarA = new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList7));
                    ArrayList arrayList8 = new ArrayList();
                    arrayList8.add(dVarA);
                    aVar = new com.mbridge.msdk.config.component.common.express.node.e(dVar, com.mbridge.msdk.config.component.common.util.c.c("877"), arrayList8);
                } else {
                    ArrayList arrayList9 = new ArrayList();
                    int i19 = this.f28549c;
                    int i20 = i19 - 2;
                    if (i20 >= 0 && ((i19 <= 2 || !this.f28548b.get(i20).equals("(")) && ((i10 = this.f28549c) <= 2 || !this.f28547a.containsKey(this.f28548b.get(i10 - 2))))) {
                        int i21 = 1;
                        while (this.f28549c < this.f28548b.size() && i21 > 0) {
                            String str11 = this.f28548b.get(this.f28549c);
                            if (str11.equals("[")) {
                                i21++;
                            } else if (str11.equals("]")) {
                                i21--;
                            }
                            if (i21 > 0) {
                                arrayList9.add(str11);
                            }
                            this.f28549c++;
                        }
                        jVar = new com.mbridge.msdk.config.component.common.express.node.f(dVar, new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList9)));
                        dVar = jVar;
                    } else {
                        ArrayList arrayList10 = new ArrayList();
                        ArrayList arrayList11 = new ArrayList();
                        int i22 = 1;
                        while (this.f28549c < this.f28548b.size() && i22 > 0) {
                            String str12 = this.f28548b.get(this.f28549c);
                            if (str12.equals("[")) {
                                i22++;
                            } else if (str12.equals("]")) {
                                i22--;
                            }
                            if (i22 > 0) {
                                if (str12.equals(",") && i22 == 1) {
                                    arrayList10.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList11)));
                                    arrayList11.clear();
                                } else {
                                    arrayList11.add(str12);
                                }
                            }
                            this.f28549c++;
                        }
                        if (!arrayList11.isEmpty()) {
                            arrayList10.add(new a().a(com.google.android.gms.internal.ads.d.a(" ", arrayList11)));
                        }
                        aVar = new com.mbridge.msdk.config.component.common.express.node.a(arrayList10);
                    }
                }
                dVar = aVar;
            }
        }
        return dVar;
    }

    private com.mbridge.msdk.config.component.common.express.node.d b(com.mbridge.msdk.config.component.common.express.node.d dVar, boolean z10) {
        return a(dVar, 0, z10);
    }
}
