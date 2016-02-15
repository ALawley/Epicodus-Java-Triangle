public class Triangle {
  private int mSideA;
  private int mSideB;
  private int mSideC;

  public Triangle (int sideA, int sideB, int sideC) {
    mSideA = sideA;
    mSideB = sideB;
    mSideC = sideC;
  }

  public int getSideA() {
    return mSideA;
  }

  public int getSideB() {
    return mSideB;
  }

  public int getSideC() {
    return mSideC;
  }

  public Boolean isEquilateral() {
    return mSideA == mSideB && mSideA == mSideC;
  }

  public Boolean isIsosceles() {
    return (mSideA == mSideB || mSideA == mSideC || mSideB == mSideC) && (mSideA != mSideB || mSideB !=mSideC);
  }

  public Boolean isScalene() {
    return mSideA != mSideB && mSideB != mSideC && mSideA != mSideC;
  }

  public Boolean isTriangle() {
    return (mSideA + mSideB) > mSideC && (mSideA + mSideC) > mSideB && (mSideB + mSideC) > mSideA;
  }
}
