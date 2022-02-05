package yana.febirizaldy.gurupaudapps.puzzle;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.abs;

public class TouchListener implements View.OnTouchListener {
    private float xDelta;
    private float yDelta;
    public static int pieceno;
    public static int piecenoget=0;
    boolean p11state,p12state,p13state,p2state,p3state;
    public static boolean yesmatched=false;
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getRawX();
        float y = motionEvent.getRawY();
        final double tolerance = sqrt(pow(view.getWidth(), 2) + pow(view.getHeight(), 2))+100 ;

        PuzzlePiece piece = (PuzzlePiece) view;
        if (!piece.canMove) {
            return true;
        }


        PuzzleX p3=new PuzzleX();
        p3state=p3.currentstatel3;
        if(p3state) {
            pieceno = p3.piececountl3;
        }


        RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                xDelta = x - lParams.leftMargin;
                yDelta = y - lParams.topMargin;
                piece.bringToFront();
                break;
            case MotionEvent.ACTION_MOVE:
                lParams.leftMargin = (int) (x - xDelta);
                lParams.topMargin = (int) (y - yDelta);
                view.setLayoutParams(lParams);
                break;
            case MotionEvent.ACTION_UP:
                int xDiff = abs(piece.xCoord - lParams.leftMargin);
                int yDiff = abs(piece.yCoord - lParams.topMargin);
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+pieceno);
                piecenoget++;
                System.out.println("***********************"+piecenoget);
                System.out.println("$$$$$$$$$$$$$$$$$$22222222222"+p2state);
                System.out.println("$$$$$$$$$$$$$$$$$$33333333333"+p3state);
                System.out.println("tolerance====================="+tolerance);
                if(pieceno==piecenoget)
                {
                    piecenoget=0;
                    pieceno=0;
                    yesmatched=true;

                    if(p3state)
                    {
                        p3.dialogshow(yesmatched);
                    }
                    p11state=false;
                    p12state=false;
                    p13state=false;
                    p2state=false;
                    p3state=false;
                    System.out.println("..........^^^^^^^^^^^............"+yesmatched);
                }
                if (xDiff <= tolerance && yDiff <= tolerance) {
                    lParams.leftMargin = piece.xCoord;
                    lParams.topMargin = piece.yCoord;
                    piece.setLayoutParams(lParams);
                    piece.canMove = false;
                    sendViewToBack(piece);
                }


                break;
        }

        return true;
    }

    public void sendViewToBack(final View child) {
        final ViewGroup parent = (ViewGroup)child.getParent();
        if (null != parent) {
            parent.removeView(child);
            parent.addView(child, 0);
        }
    }
}