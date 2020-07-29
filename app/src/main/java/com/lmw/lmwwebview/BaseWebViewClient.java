package com.lmw.lmwwebview;

import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BaseWebViewClient extends WebViewClient {

    /**
     * 多页面在同一个WebView中打开，就是不新建activity或者调用系统浏览器打开
     */
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }

    @Override
    public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
        super.onReceivedError(view, request, error);
        Log.d("LMW",error.getDescription().toString());
    }
}
