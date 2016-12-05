package md546c45d491b042b167774b8aaeb1a2ac0;


public class SlidingUpPanelLayout
	extends android.view.ViewGroup
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFinishInflate:()V:GetOnFinishInflateHandler\n" +
			"n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\n" +
			"n_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\n" +
			"n_onSizeChanged:(IIII)V:GetOnSizeChanged_IIIIHandler\n" +
			"n_onInterceptTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnInterceptTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_onTouchEvent:(Landroid/view/MotionEvent;)Z:GetOnTouchEvent_Landroid_view_MotionEvent_Handler\n" +
			"n_drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z:GetDrawChild_Landroid_graphics_Canvas_Landroid_view_View_JHandler\n" +
			"n_computeScroll:()V:GetComputeScrollHandler\n" +
			"n_draw:(Landroid/graphics/Canvas;)V:GetDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_generateDefaultLayoutParams:()Landroid/view/ViewGroup$LayoutParams;:GetGenerateDefaultLayoutParamsHandler\n" +
			"n_generateLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;:GetGenerateLayoutParams_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_checkLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)Z:GetCheckLayoutParams_Landroid_view_ViewGroup_LayoutParams_Handler\n" +
			"n_generateLayoutParams:(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;:GetGenerateLayoutParams_Landroid_util_AttributeSet_Handler\n" +
			"n_onSaveInstanceState:()Landroid/os/Parcelable;:GetOnSaveInstanceStateHandler\n" +
			"n_onRestoreInstanceState:(Landroid/os/Parcelable;)V:GetOnRestoreInstanceState_Landroid_os_Parcelable_Handler\n" +
			"";
		mono.android.Runtime.register ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", SlidingUpPanelLayout.class, __md_methods);
	}


	public SlidingUpPanelLayout (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == SlidingUpPanelLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public SlidingUpPanelLayout (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == SlidingUpPanelLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public SlidingUpPanelLayout (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == SlidingUpPanelLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public SlidingUpPanelLayout (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) throws java.lang.Throwable
	{
		super (p0, p1, p2, p3);
		if (getClass () == SlidingUpPanelLayout.class)
			mono.android.TypeManager.Activate ("Cheesebaron.SlidingUpPanel.SlidingUpPanelLayout, Cheesebaron.SlidingUpPanel, Version=1.0.5.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public void onFinishInflate ()
	{
		n_onFinishInflate ();
	}

	private native void n_onFinishInflate ();


	public void onAttachedToWindow ()
	{
		n_onAttachedToWindow ();
	}

	private native void n_onAttachedToWindow ();


	public void onDetachedFromWindow ()
	{
		n_onDetachedFromWindow ();
	}

	private native void n_onDetachedFromWindow ();


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);


	public void onLayout (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayout (p0, p1, p2, p3, p4);
	}

	private native void n_onLayout (boolean p0, int p1, int p2, int p3, int p4);


	public void onSizeChanged (int p0, int p1, int p2, int p3)
	{
		n_onSizeChanged (p0, p1, p2, p3);
	}

	private native void n_onSizeChanged (int p0, int p1, int p2, int p3);


	public boolean onInterceptTouchEvent (android.view.MotionEvent p0)
	{
		return n_onInterceptTouchEvent (p0);
	}

	private native boolean n_onInterceptTouchEvent (android.view.MotionEvent p0);


	public boolean onTouchEvent (android.view.MotionEvent p0)
	{
		return n_onTouchEvent (p0);
	}

	private native boolean n_onTouchEvent (android.view.MotionEvent p0);


	public boolean drawChild (android.graphics.Canvas p0, android.view.View p1, long p2)
	{
		return n_drawChild (p0, p1, p2);
	}

	private native boolean n_drawChild (android.graphics.Canvas p0, android.view.View p1, long p2);


	public void computeScroll ()
	{
		n_computeScroll ();
	}

	private native void n_computeScroll ();


	public void draw (android.graphics.Canvas p0)
	{
		n_draw (p0);
	}

	private native void n_draw (android.graphics.Canvas p0);


	public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams ()
	{
		return n_generateDefaultLayoutParams ();
	}

	private native android.view.ViewGroup.LayoutParams n_generateDefaultLayoutParams ();


	public android.view.ViewGroup.LayoutParams generateLayoutParams (android.view.ViewGroup.LayoutParams p0)
	{
		return n_generateLayoutParams (p0);
	}

	private native android.view.ViewGroup.LayoutParams n_generateLayoutParams (android.view.ViewGroup.LayoutParams p0);


	public boolean checkLayoutParams (android.view.ViewGroup.LayoutParams p0)
	{
		return n_checkLayoutParams (p0);
	}

	private native boolean n_checkLayoutParams (android.view.ViewGroup.LayoutParams p0);


	public android.view.ViewGroup.LayoutParams generateLayoutParams (android.util.AttributeSet p0)
	{
		return n_generateLayoutParams (p0);
	}

	private native android.view.ViewGroup.LayoutParams n_generateLayoutParams (android.util.AttributeSet p0);


	public android.os.Parcelable onSaveInstanceState ()
	{
		return n_onSaveInstanceState ();
	}

	private native android.os.Parcelable n_onSaveInstanceState ();


	public void onRestoreInstanceState (android.os.Parcelable p0)
	{
		n_onRestoreInstanceState (p0);
	}

	private native void n_onRestoreInstanceState (android.os.Parcelable p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
