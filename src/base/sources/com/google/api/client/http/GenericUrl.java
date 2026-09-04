package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.escape.CharEscapers;
import com.google.api.client.util.escape.Escaper;
import com.google.api.client.util.escape.PercentEscaper;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GenericUrl extends GenericData {
    private static final Escaper URI_FRAGMENT_ESCAPER = new PercentEscaper("=&-_.!~*'()@:$,;/?:");
    private String fragment;
    private String host;
    private List<String> pathParts;
    private int port;
    private String scheme;
    private String userInfo;
    private boolean verbatim;

    public GenericUrl() {
        this.port = -1;
    }

    static void addQueryParams(Set<Map.Entry<String, Object>> set, StringBuilder sb2, boolean z10) {
        boolean zAppendParam = true;
        for (Map.Entry<String, Object> entry : set) {
            Object value = entry.getValue();
            if (value != null) {
                String key = z10 ? entry.getKey() : CharEscapers.escapeUriQuery(entry.getKey());
                if (value instanceof Collection) {
                    Iterator it = ((Collection) value).iterator();
                    while (it.hasNext()) {
                        zAppendParam = appendParam(zAppendParam, sb2, key, it.next(), z10);
                    }
                } else {
                    zAppendParam = appendParam(zAppendParam, sb2, key, value, z10);
                }
            }
        }
    }

    private static boolean appendParam(boolean z10, StringBuilder sb2, String str, Object obj, boolean z11) {
        if (z10) {
            sb2.append('?');
            z10 = false;
        } else {
            sb2.append('&');
        }
        sb2.append(str);
        String string = z11 ? obj.toString() : CharEscapers.escapeUriQuery(obj.toString());
        if (string.length() != 0) {
            sb2.append('=');
            sb2.append(string);
        }
        return z10;
    }

    private void appendRawPathFromParts(StringBuilder sb2) {
        int size = this.pathParts.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strEscapeUriPath = this.pathParts.get(i10);
            if (i10 != 0) {
                sb2.append('/');
            }
            if (strEscapeUriPath.length() != 0) {
                if (!this.verbatim) {
                    strEscapeUriPath = CharEscapers.escapeUriPath(strEscapeUriPath);
                }
                sb2.append(strEscapeUriPath);
            }
        }
    }

    private static URL parseURL(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static List<String> toPathParts(String str) {
        return toPathParts(str, false);
    }

    public void appendRawPath(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        List<String> pathParts = toPathParts(str, this.verbatim);
        List<String> list = this.pathParts;
        if (list == null || list.isEmpty()) {
            this.pathParts = pathParts;
            return;
        }
        int size = this.pathParts.size();
        int i10 = size - 1;
        this.pathParts.set(i10, this.pathParts.get(i10) + pathParts.get(0));
        this.pathParts.addAll(pathParts.subList(1, pathParts.size()));
    }

    public final String build() {
        return buildAuthority() + buildRelativeUrl();
    }

    public final String buildAuthority() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) Preconditions.checkNotNull(this.scheme));
        sb2.append("://");
        String strEscapeUriUserInfo = this.userInfo;
        if (strEscapeUriUserInfo != null) {
            if (!this.verbatim) {
                strEscapeUriUserInfo = CharEscapers.escapeUriUserInfo(strEscapeUriUserInfo);
            }
            sb2.append(strEscapeUriUserInfo);
            sb2.append('@');
        }
        sb2.append((String) Preconditions.checkNotNull(this.host));
        int i10 = this.port;
        if (i10 != -1) {
            sb2.append(':');
            sb2.append(i10);
        }
        return sb2.toString();
    }

    public final String buildRelativeUrl() {
        StringBuilder sb2 = new StringBuilder();
        if (this.pathParts != null) {
            appendRawPathFromParts(sb2);
        }
        addQueryParams(entrySet(), sb2, this.verbatim);
        String strEscape = this.fragment;
        if (strEscape != null) {
            sb2.append('#');
            if (!this.verbatim) {
                strEscape = URI_FRAGMENT_ESCAPER.escape(strEscape);
            }
            sb2.append(strEscape);
        }
        return sb2.toString();
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof GenericUrl)) {
            return build().equals(((GenericUrl) obj).build());
        }
        return false;
    }

    public Collection<Object> getAll(String str) {
        Object obj = get(str);
        if (obj == null) {
            return Collections.EMPTY_SET;
        }
        return obj instanceof Collection ? Collections.unmodifiableCollection((Collection) obj) : Collections.singleton(obj);
    }

    public Object getFirst(String str) {
        Object obj = get(str);
        if (!(obj instanceof Collection)) {
            return obj;
        }
        Iterator it = ((Collection) obj).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public String getFragment() {
        return this.fragment;
    }

    public String getHost() {
        return this.host;
    }

    public List<String> getPathParts() {
        return this.pathParts;
    }

    public int getPort() {
        return this.port;
    }

    public String getRawPath() {
        if (this.pathParts == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        appendRawPathFromParts(sb2);
        return sb2.toString();
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getUserInfo() {
        return this.userInfo;
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return build().hashCode();
    }

    public final void setFragment(String str) {
        this.fragment = str;
    }

    public final void setHost(String str) {
        this.host = (String) Preconditions.checkNotNull(str);
    }

    public void setPathParts(List<String> list) {
        this.pathParts = list;
    }

    public final void setPort(int i10) {
        Preconditions.checkArgument(i10 >= -1, "expected port >= -1");
        this.port = i10;
    }

    public void setRawPath(String str) {
        this.pathParts = toPathParts(str, this.verbatim);
    }

    public final void setScheme(String str) {
        this.scheme = (String) Preconditions.checkNotNull(str);
    }

    public final void setUserInfo(String str) {
        this.userInfo = str;
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public String toString() {
        return build();
    }

    public final URI toURI() {
        return toURI(build());
    }

    public final URL toURL() {
        return parseURL(build());
    }

    public static List<String> toPathParts(String str, boolean z10) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z11 = true;
        while (z11) {
            int iIndexOf = str.indexOf(47, i10);
            boolean z12 = iIndexOf != -1;
            String strSubstring = z12 ? str.substring(i10, iIndexOf) : str.substring(i10);
            if (!z10) {
                strSubstring = CharEscapers.decodeUriPath(strSubstring);
            }
            arrayList.add(strSubstring);
            i10 = iIndexOf + 1;
            z11 = z12;
        }
        return arrayList;
    }

    private static URI toURI(String str) {
        try {
            return new URI(str);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // com.google.api.client.util.GenericData
    public GenericUrl set(String str, Object obj) {
        return (GenericUrl) super.set(str, obj);
    }

    public final URL toURL(String str) {
        try {
            return new URL(toURL(), str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public GenericUrl(String str) {
        this(str, false);
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public GenericUrl clone() {
        GenericUrl genericUrl = (GenericUrl) super.clone();
        if (this.pathParts != null) {
            genericUrl.pathParts = new ArrayList(this.pathParts);
        }
        return genericUrl;
    }

    public GenericUrl(String str, boolean z10) {
        this(parseURL(str), z10);
    }

    public GenericUrl(URI uri) {
        this(uri, false);
    }

    public GenericUrl(URI uri, boolean z10) {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo(), z10);
    }

    public GenericUrl(URL url) {
        this(url, false);
    }

    public GenericUrl(URL url, boolean z10) {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo(), z10);
    }

    private GenericUrl(String str, String str2, int i10, String str3, String str4, String str5, String str6, boolean z10) {
        this.port = -1;
        this.scheme = str.toLowerCase(Locale.US);
        this.host = str2;
        this.port = i10;
        this.pathParts = toPathParts(str3, z10);
        this.verbatim = z10;
        if (z10) {
            this.fragment = str4;
            if (str5 != null) {
                UrlEncodedParser.parse(str5, (Object) this, false);
            }
            this.userInfo = str6;
            return;
        }
        this.fragment = str4 != null ? CharEscapers.decodeUri(str4) : null;
        if (str5 != null) {
            UrlEncodedParser.parse(str5, this);
        }
        this.userInfo = str6 != null ? CharEscapers.decodeUri(str6) : null;
    }
}
