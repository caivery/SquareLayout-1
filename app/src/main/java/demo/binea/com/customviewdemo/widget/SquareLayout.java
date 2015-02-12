package demo.binea.com.customviewdemo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * Created by xubinggui on 15/2/12.
 */
public class SquareLayout extends ViewGroup {

	private static final int ORIENTATION_HORIZONTAL = 0, ORIENTATION_VERTICAL = 1;// 排列方向的常量标识值
	private static final int DEFAULT_MAX_ROW = Integer.MAX_VALUE, DEFAULT_MAX_COLUMN = Integer.MAX_VALUE;// 最大行列默认值

	private int mMaxRow = DEFAULT_MAX_ROW;
	private int mMaxColumn = DEFAULT_MAX_COLUMN;

	private int mOrientation = ORIENTATION_HORIZONTAL;

	public SquareLayout(Context context) {
		this(context, null);
	}

	public SquareLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onLayout(boolean changed, int l, int t, int r, int b) {

	}

	@Override
	protected LayoutParams generateDefaultLayoutParams() {
		return new MarginLayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
	}

	@Override
	protected LayoutParams generateLayoutParams(LayoutParams p) {
		return new MarginLayoutParams(p);
	}

	@Override
	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
		return new MarginLayoutParams(getContext(), attrs);
	}

	@Override
	protected boolean checkLayoutParams(LayoutParams p) {
		return p instanceof MarginLayoutParams;
	}
}
