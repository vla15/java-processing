package com.company.Rectangle;

import processing.core.PApplet;

public class Rectangle {
    PApplet p;
    int x = 1;
    int y = 1;
    private boolean shouldReverse = false;

    public Rectangle (PApplet p, int x, int y) {
        this.p = p;
        this.x = x;
        this.y = y;
    }

    public void drawIt() {
        p.stroke(0);
        p.fill(255, 255, 255);

        if (this.x == p.width - 100) {
            this.reverseDirection();
        }

        if (this.x == 0) {
            this.reverseDirection();
        }

        if (this.getDirection()) {
            p.rect(this.x--, this.y, 100, 50);
        } else {
            p.rect(this.x++, this.y, 100, 50);
        }
    }

    public void reverseDirection() {
        this.shouldReverse = !this.shouldReverse;
    }

    public boolean getDirection() {
        return this.shouldReverse;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }


}
