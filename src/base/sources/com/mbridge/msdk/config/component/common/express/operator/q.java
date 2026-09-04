package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f28629a;

    public q(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f28629a = cVar;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        String str2;
        Object obj2;
        String strValueOf = "";
        if (obj == null) {
            str2 = "821";
            if (!str.equals(com.mbridge.msdk.config.component.common.util.c.c("802")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("803")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("804")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("805")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("811")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("812")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("813")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("814")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("815")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("817")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("818")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("819")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c("820")) && !str.equals(com.mbridge.msdk.config.component.common.util.c.c(str2))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            obj2 = "";
        } else {
            str2 = "821";
            obj2 = obj;
        }
        String string = obj2.toString();
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        }
        String str3 = strValueOf;
        try {
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("800"))) {
                return a(obj2, new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.z
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((String) obj3).toLowerCase();
                    }
                });
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("801"))) {
                return a(obj2, new Function() { // from class: com.mbridge.msdk.config.component.common.express.operator.a0
                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((String) obj3).toUpperCase();
                    }
                });
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("802"))) {
                return a(obj2, str3);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("803"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.contains(str3)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("804"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.startsWith(str3)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("805"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(string.endsWith(str3)));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("806"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Base64.encodeToString(string.getBytes(), 0));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("807"))) {
                try {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new String(Base64.decode(string, 0), C.UTF8_NAME));
                } catch (Exception e10) {
                    q0.b("StringOperator", "Base64解码失败: " + e10.getMessage());
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("808"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.b(string));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("809"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(k0.a(string));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("810"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.b(string, str3));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("811"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(string.length()));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("812"))) {
                return a(string);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("813"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(SameMD5.getMD5(string));
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("814"))) {
                return a(string, str3);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("815"))) {
                return b(string, str3);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("816"))) {
                return b(string, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("817"))) {
                return d(string, str3);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("818"))) {
                return a(string, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("819"))) {
                return d(string, list);
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c("820"))) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.d());
            }
            if (str.equals(com.mbridge.msdk.config.component.common.util.c.c(str2))) {
                return c(string, list);
            }
            return str.equals(com.mbridge.msdk.config.component.common.util.c.c("896")) ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(v0.a(string, str3)) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        } catch (Exception e11) {
            q0.b("StringOperator", e11.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private String c(String str, String str2) {
        if (str2.equals(com.mbridge.msdk.config.component.common.util.c.c("800"))) {
            return str.toLowerCase();
        }
        if (str2.equals(com.mbridge.msdk.config.component.common.util.c.c("801"))) {
            return str.toUpperCase();
        }
        return null;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
        }
        if (TextUtils.isEmpty(str2)) {
            arrayList.add(str);
        } else {
            arrayList.addAll(Arrays.asList(str.split(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        return b(str) ? b(str, obj, list) : com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(String str, List<Object> list) {
        Map map;
        if (list != null) {
            boolean z10 = true;
            if (list.size() == 1) {
                if (str == null) {
                    str = "";
                }
                Object obj = list.get(0);
                boolean z11 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
                if (!z11 && !(obj instanceof Map)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
                }
                if (z11) {
                    map = new HashMap();
                    for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                } else {
                    map = (Map) obj;
                }
                try {
                    StringBuilder sb2 = new StringBuilder(str);
                    if (!str.contains("?")) {
                        sb2.append("?");
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (!z10) {
                            sb2.append("&");
                        }
                        sb2.append((String) entry2.getKey());
                        sb2.append("=");
                        sb2.append(URLEncoder.encode(String.valueOf(entry2.getValue()), C.UTF8_NAME));
                        z10 = false;
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
                } catch (Throwable th2) {
                    q0.b("StringOperator", "Error encoding URL parameters: " + th2.getMessage(), th2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, Function<String, String> function) {
        if (obj != null) {
            try {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(function.apply(String.valueOf(obj)));
            } catch (Exception e10) {
                q0.b("StringOperator", e10.getMessage(), e10);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(String str, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
        }
        try {
            String strEncode = URLEncoder.encode(str, C.UTF8_NAME);
            if (!TextUtils.isEmpty(strEncode)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(strEncode);
            }
        } catch (Throwable th2) {
            q0.b("StringOperator", th2.getMessage(), th2);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, String str) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(obj);
        }
        if (str != null) {
            sb2.append(str);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str) {
        if (TextUtils.isEmpty(str)) {
            q0.b("StringOperator", "JSON字符串为空");
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        try {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a((Object) new JSONObject(str)));
        } catch (JSONException e10) {
            q0.b("StringOperator", "JSON字符串转Map对象失败: " + e10.getMessage() + ", JSON字符串: " + str);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        } catch (Exception e11) {
            q0.b("StringOperator", "JSON字符串转Map对象异常: " + e11.getMessage());
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private Map<String, Object> a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (TextUtils.isEmpty(next)) {
                q0.d("StringOperator", "跳过空键: " + next);
            } else {
                map.put(next, a(jSONObject.get(next)));
            }
        }
        return map;
    }

    private List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(a(jSONArray.get(i10)));
        }
        return arrayList;
    }

    private Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.indexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            String strValueOf = String.valueOf(list.get(0));
            String strValueOf2 = String.valueOf(list.get(1));
            if (TextUtils.isEmpty(strValueOf)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.replace(strValueOf, strValueOf2));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(str.lastIndexOf(str2)));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(-1);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, List<Object> list) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() >= 2) {
            try {
                int i10 = Integer.parseInt(String.valueOf(list.get(0)));
                int i11 = Integer.parseInt(String.valueOf(list.get(1)));
                if (i10 >= 0 && i11 < str.length() && i10 <= i11) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(str.substring(i10, i11 + 1));
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (NumberFormatException e10) {
                q0.b("StringOperator", "subString操作参数格式错误: " + e10.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            } catch (StringIndexOutOfBoundsException e11) {
                q0.b("StringOperator", "subString操作索引越界: " + e11.getMessage());
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private boolean b(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("800")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("801")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("802")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("803")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("804")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("805")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("806")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("807")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("808")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("809")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("810")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("811")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("812")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("813")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("814")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("815")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("816")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("817")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("818")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("819")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("820")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("821")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("896"));
    }
}
