<?xml version="1.0" encoding="utf-8"?>

<xsl:stylesheet version = "1.0" xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
    <xsl:template match = "/">
        <html>
            <body>
                <h1>Hallgatók adatai</h1>

                <table border = "2">
                    <xsl:for-each select="class/student">
                        <tr bgcolor = "red">
                            <th>ID</th>
                            <th>Vezeteknev</th>
                            <th>Keresztnev</th>
                            <th>Becenev</th>
                            <th>Kor</th>
                        </tr>
                        <tr>
                            <td>
                                <xsl:value-of select = "@id"/>
                            </td>
                            <td><xsl:value-of select = "keresznev"/></td>
                            <td><xsl:value-of select = "vezeteknev"/></td>
                            <td><xsl:value-of select = "becenev"/></td>
                            <td><xsl:value-of select = "kor"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>