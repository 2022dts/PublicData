class Foo {
  
    interface Bar {
        void a();
    }
  
    public void doThings() {

        /**
         * Below creates 2 anonymous class which
         * implements interface `Bar` instantly
         */
        Bar anony0 = new Bar() {
            public void a() {
                /* ... */
            }
        };

        Bar anony1 = new Bar() {
            public void a() {
                /* ... */
            }
        };
        
    }         
}