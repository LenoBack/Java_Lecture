package ch11.nestedinf;

interface printable{
    void print();
    interface MessagePrintable{
        void msg();
    }
}